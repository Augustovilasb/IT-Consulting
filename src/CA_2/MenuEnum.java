package CA_2;

public  enum MenuEnum {

    SORT(11, "Sort"),
    SEARCH(12, "Search"),

    ADD_EMPLOYEE(21, "Add Employee"),
    GENERATE_RANDOM_EMPLOYEE(22, "Generate Random Employee"),

    MAIN_MANAGER(31, "Main Manager"),
    ASSISTANT_MANAGER(32, "Assistant Manager"),
    TEAM_LEADER(33, "Team Leader"),

    CUSTOMER_SERVICE(41,"Customer Service"),
    TECHNICAL_SUPPORT(42, "Technical Support"),
    HUMAN_RESOURCES(43, "Human Resources"),
    SALES(44, "Sales"),
    MARKETING(45, "Marketing"),
    DEVELOPMENT(46, "Development");

    private final int key;
    private final String description;

    MenuEnum(int key, String description) {
        this.key = key;
        this.description = description;
    }

    public int getKey() {
        return key;
    }
    public String getDescription() {
        return description; //
    }

    public static MenuEnum fromKey(int key) {
        for (MenuEnum status: MenuEnum.values()) {
            if (status.getKey() == key) {
                return status;
            }
        }
    throw new IllegalArgumentException("Invalid Key: " + key);
    }
}