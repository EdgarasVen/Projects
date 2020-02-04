import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MyNetwork implements SocialNetwork {
    Set<Friend> listOfFriends = new HashSet<>();

    @Override
    public void addFriend(Friend friend) {
        if(friend==null) throw new IllegalArgumentException();
        listOfFriends.add(friend);
    }

    @Override
    public int getNumberOfFriends() {
        return listOfFriends.size();
    }

    @Override
    public Friend findFriend(String s, String s1) throws FriendNotFoundException {
        if(s==null || s1==null) throw new IllegalArgumentException();
        else
        return listOfFriends.stream()
                .filter(friend->friend.getFirstName().equals(s)&&friend.getLastName().equals(s1))
                .findFirst()
                .orElseThrow(()->new FriendNotFoundException(s,s1));
    }

    @Override
    public Collection<Friend> findByCity(String s) {
        if (s==null) throw new IllegalArgumentException();
        else
        return listOfFriends.stream()
                .filter(friend -> friend.getCity().equals(s))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<Friend> getOrderedFriends() {
        Comparator<Friend> comparator = Comparator
                .comparing(Friend::getCity)
                .thenComparing(Friend::getLastName)
                .thenComparing(Friend::getFirstName);
        return listOfFriends.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }
}
