package model;

public class Voter {

    private int voteId;
    private String name;
    private int age;

    public Voter(int voteId, String name, int age) throws InValidAgeException {

        if (age < 18) {
            throw new InValidAgeException("Age is Invalid");
        }

        this.voteId = voteId;
        this.name = name;
        this.age = age;
    }

    public int getVoteId() {
        return voteId;
    }

    public void setVoteId(int voteId) {
        this.voteId = voteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "voteId=" + voteId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
