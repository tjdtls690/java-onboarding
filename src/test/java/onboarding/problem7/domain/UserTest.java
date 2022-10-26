package onboarding.problem7.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {
    @Test
    @DisplayName("유저의 친구목록 저장하기")
    void addFriend() {
        User user = new User("jun");
        user.addFriend("pobi");
        assertThat(user.getFriends()).isEqualTo(new Friends(Set.of("pobi")));
    }
    
    @Test
    @DisplayName("함계 아는 친구 명수 구하기")
    void numberOfFriendsYouKnowTogether() {
        User jun = new User("jun");
        User pobi = new User("pobi");
        
        jun.addFriend("jk");
        jun.addFriend("crong");
        pobi.addFriend("jk");
        pobi.addFriend("crong");
        
        assertThat(jun.numberOfFriendsYouKnowTogether(pobi)).isEqualTo(2);
    }
}
