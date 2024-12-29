package modules;

import java.util.ArrayList;

public class School {
    private ArrayList<Person> members = new ArrayList<>();

    public School() {
        setMembers(members);
    }

    public ArrayList<Person> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Person> members) {
        this.members = members;
    }

    public void addMember(Person person) {
        members.add(person);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Person member : members) {
            sb.append(member).append("\n");
        }
        return sb.toString();
    }
}
