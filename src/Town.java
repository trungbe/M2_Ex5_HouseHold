import java.util.ArrayList;

public class Town {
    private ArrayList<Household> householdList = new ArrayList<>();

    public void addNewHousehold(Household household) {
        householdList.add(household);
    }

    public void displayHouseholdPersonOldAge() {
        for (int i = 0; i < householdList.size(); i++) {
            Household household = householdList.get(i);
            boolean result = household.CheckAge();
            if (result) {
                System.out.println(household.toString());
            }
        }
    }
}
