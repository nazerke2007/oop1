package assignment1;

class Pet extends Animal {
    private String type;

    public Pet(String name, String type, int age) {
        super(name, age);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pet{name='" + getName() + "', type='" + type + "', age=" + getAge() + "}";
    }
}

