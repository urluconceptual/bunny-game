package ro.pao.service;
import ro.pao.model.Friend;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface FriendService {

    Optional<Friend> getFriendById(UUID id);

    List<Friend> getAllFriends();

    void addFriends(List<Friend> friends);

    void addFriend(Friend friend);
}
