package com.kodilla.testing.forum;

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

//    @Override
//    public boolean equals (Object o){
//    return this.author.equals(o.author)&& this.postBody.equals(o.postBody);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        return this.author.equals(((ForumPost) o).author) && this.postBody.equals(((ForumPost) o).postBody);
//        if (!postBody.equals(forumPost.postBody)) return false;
//        return author.equals(forumPost.author);
    }

    @Override
    public int hashCode() {
        int result = postBody.hashCode();
        result = 31 * result + author.hashCode();
        return result;
         /*
        int hashCode = 7;
        hashCode += 31 * postBody.length;
        hashCode += 31 * author.length;
        return hashCode;
       */
    }
}