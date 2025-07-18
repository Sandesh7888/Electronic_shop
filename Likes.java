package Project_Java;

public class Likes {
    private int likes;

    public Likes() {
        this.likes = 0;
    }

    public void addLike() {
        likes++;
    }

    public void removeLike() {
        if (likes > 0) {
            likes--;
        }
    }

    public int getLikes() {
        return likes;
    }
}

