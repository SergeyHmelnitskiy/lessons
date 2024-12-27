package lesson4;

public class Park {
    private String name;
    private String city;
    private String workingHours;
    private Attraction[] attractions;

    public Park(String name, String city, String workingHours, int numberOfAttractions) {
        this.name = name;
        this.city = city;
        this.workingHours = workingHours;
        this.attractions = new Attraction[numberOfAttractions];
    }

    public void printPark() {
        System.out.println("Название парка: " + name + "; город: " + city + "; время работы: " +
                workingHours + "\n" + "аттракционы: ");
    }

    public void printAttractions() {
        for (Attraction attraction : attractions) {
            System.out.print(attraction);
        }
    }

    public void addAttraction(int index, String nameAttraction, String workingHours, int price) {
        attractions[index] = new Attraction(nameAttraction, workingHours, price);
    }

    public class Attraction {
        private String nameAttraction;
        private String workingHours;
        private int price;

        public Attraction(String nameAttraction, String workingHours, int price) {
            this.nameAttraction = nameAttraction;
            this.workingHours = workingHours;
            this.price = price;
        }

        public String toString() {
            return "Аттракцион: " + nameAttraction + "; время работы: " +
                    workingHours + "; стоимость: " + price + "\n";
        }
    }
}
