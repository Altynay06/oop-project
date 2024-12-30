public class school {
}
// School class
class School {
    Person[] members; // Array to store members
    int memberCount;  // Tracks how many members are added

    // Constructor
    School() {
        members = new Person[20]; // Array can hold up to 20 members
        memberCount = 0;
    }

    // Add a person to the school
    void addMember(Person person) {
        if (memberCount < members.length) {
            members[memberCount] = person;
            memberCount++;
        }
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < memberCount; i++) {
            result += members[i].toString() + "\n";
        }
        return result;
    }
}