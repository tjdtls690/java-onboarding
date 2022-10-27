package onboarding.problem7.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Users {
    private final Map<String, User> users;
    
    public Users(final List<List<String>> friends, final List<String> visitors) {
        this.users = initUsers(friends, visitors);
    }
    
    private Map<String, User> initUsers(List<List<String>> friends, final List<String> visitors) {
        List<List<String>> mergeUsers = mergeUsers(friends, visitors);
        return mergeUsers.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toMap(friendName -> friendName, User::new, (firstUser, secondUser) -> firstUser));
    }
    
    private List<List<String>> mergeUsers(final List<List<String>> friends, final List<String> visitors) {
        List<List<String>> mergeUsers = new ArrayList<>(friends);
        mergeUsers.add(visitors);
        return mergeUsers;
    }
    
    public void addAllUserFriends(final List<List<String>> friends) {
        for (List<String> friend : friends) {
            final String firstUserName = friend.get(0);
            final String secondUserName = friend.get(1);
            
            users.get(firstUserName).addFriend(secondUserName);
            users.get(secondUserName).addFriend(firstUserName);
        }
    }
    
    public void addScoreOfNumberOfFriendsYouKnowTogether(final String userName) {
        for (String targetUserName : users.keySet()) {
            addScoreOfNumberOfFriendsYouKnowTogether(userName, users.get(userName), targetUserName);
        }
    }
    
    private void addScoreOfNumberOfFriendsYouKnowTogether(final String userName, final User user, final String targetName) {
        if (!userName.equals(targetName)) {
            final User targetUser = users.get(targetName);
            final int numberOfFriendsYouKnowTogether = targetUser.numberOfFriendsYouKnowTogether(user);
            targetUser.addScoreOfNumberOfFriendsYouKnowTogether(numberOfFriendsYouKnowTogether);
        }
    }
    
    public void addVisitScore(final List<String> visitors) {
        visitors.stream()
                .map(users::get)
                .forEach(User::addVisitScore);
    }
    
    public List<String> recommendedFriends(String user) {
        return users.keySet().stream()
                .filter(userName -> !users.get(user).friendsContains(userName))
                .map(users::get)
                .filter(User::isNotZeroScore)
                .sorted()
                .limit(5)
                .map(User::getUserName)
                .collect(Collectors.toList());
    }
    
    @Override
    public String toString() {
        return "Users{" +
                "users=" + users +
                '}';
    }
}
