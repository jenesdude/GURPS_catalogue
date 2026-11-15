package src.main.java.com.gurps.model;

public class Trait {

    private Long id;
    private String name;
    private int cost;           // стоимость в очках (может быть отрицательной для недостатков)
    private String description;
    private boolean disadvantage; // true — недостаток, false — преимущество

    public Trait() {
    }

    public Trait(String name, int cost, String description, boolean disadvantage) {
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.disadvantage = disadvantage;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getCost() { return cost; }
    public void setCost(int cost) { this.cost = cost; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public boolean isDisadvantage() { return disadvantage; }
    public void setDisadvantage(boolean disadvantage) { this.disadvantage = disadvantage; }
}