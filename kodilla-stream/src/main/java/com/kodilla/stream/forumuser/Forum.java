package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1,"Smith",'M',2000,3,25,0));
        forumUserList.add(new ForumUser(2,"Wnuk",'K',1990,1,1,3));
        forumUserList.add(new ForumUser(3,"Kowalski",'M',2005,9,12,10));
        forumUserList.add(new ForumUser(4,"Herr",'M',1996,4,26,4));
    }
    public List<ForumUser> getUserList(){

        return new ArrayList<>(forumUserList);
    }
}
