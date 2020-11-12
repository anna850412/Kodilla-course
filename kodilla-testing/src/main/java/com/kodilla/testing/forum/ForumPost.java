package com.kodilla.testing.forum;

import java.util.Objects;

public class ForumPost {
    private String postBody;
    private String author;

    public ForumPost(String postBody, String author) {
        this.postBody = postBody;
        this.author = author;
    }

    public String getPostBody() {
        return postBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    /*
    public boolean equals (Forum Post o){
    return this.postBody.equals(o.postBody) && this.author.equals(o.author);
    }
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumPost forumPost = (ForumPost) o;
        return postBody.equals(forumPost.postBody) &&
                author.equals(forumPost.author);
    }

    @Override
    public int hashCode() {
        /*
        int hashCode = 7;
        hashCode += 31 * postBody.length;
        hashCode += 31 * author.length;
        return hashCode;
         */
        return Objects.hash(postBody, author);
    }
}
