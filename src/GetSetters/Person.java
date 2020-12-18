package GetSetters;

public class Person {
    String name, lastName;
    int age, rankNumber, weight;

    private boolean isCorrectWA(int arg) {
        return (arg <= 30 && arg <= 200);
    }

    private boolean isCorrectRank(int arg) {
        return (1 <= arg && arg <= 6);
    }

/*    private boolean isCorrectNames(String arg){
        String regex = "[0-9A-Za-z\\s\\-]+";
    }*/

    void setFIO(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    void setAge(int age) {
        if (isCorrectWA(age)) {
            this.age = age;
        }
    }

    void setWeight(int weight) {
        if (isCorrectWA(weight)) {
            this.weight = weight;
        }
    }

    void setRank(int rankNumber) {
        if (isCorrectRank(rankNumber)) {
            this.rankNumber = rankNumber;
        }
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getRankNumber() {
        return rankNumber;
    }

    public int getWeight() {
        return weight;
    }

}
