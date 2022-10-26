package onboarding.problem7.domain;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Users {
    private final Map<String, User> users;
    
    public Users(final List<List<String>> friends, final List<String> visitors) {
        this.users = initUsers(friends, visitors);
        addAllUserFriends(friends);
    }
    
    private Map<String, User> initUsers(final List<List<String>> friends, final List<String> visitors) {
        friends.get(0).addAll(visitors);
        return friends.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toMap(friendName -> friendName, User::new));
    }
    
    private void addAllUserFriends(final List<List<String>> friends) {
        for (List<String> friend : friends) {
            final String firstUserName = friend.get(0);
            final String secondUserName = friend.get(1);
            
            User user = users.get(firstUserName);
            user.addFriend(secondUserName);
            
            user = users.get(secondUserName);
            user.addFriend(firstUserName);
        }
    }
}