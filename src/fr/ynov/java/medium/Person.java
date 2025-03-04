package fr.ynov.java.medium;

enum Nationality {
    FRENCH,
    ENGLISH,
    AMERICAN,
    GERMAN,
    SPANISH,
    ITALIAN,
    JAPANESE,
    CHINESE,
    RUSSIAN,
    BRAZILIAN,
    CANADIAN,
    AUSTRALIAN,
    INDIAN,
    MEXICAN,
    ARGENTINIAN,
    SWISS,
    BELGIAN,
    DUTCH,
    PORTUGUESE,
    SWEDISH,
    NORWEGIAN,
    DANISH,
    FINNISH,
    POLISH,
    CZECH,
    SLOVAK,
    HUNGARIAN,
    ROMANIAN,
    BULGARIAN,
    GREEK,
    TURKISH,
    EGYPTIAN,
    MOROCCAN,
    ALGERIAN,
    TUNISIAN,
    IVORIAN,
    SENEGALESE,
    MALIAN,
    NIGERIAN,
    CAMEROONIAN,
    CONGOLESE,
    ANGOLAN,
    SOUTH_AFRICAN,
    KENYAN,
    UGANDAN,
    TANZANIAN,
    ETHIOPIAN,
    SOMALI,
    SUDANESE,
    IRAQI,
    IRANIAN,
    SAUDI,
    ISRAELI,
    LEBANESE,
    SYRIAN,
    JORDANIAN,
    PALESTINIAN,
    YEMENI,
    EMIRATI,
    QATARI,
    KUWAITI,
    BAHRAINI,
    OMANI,
    IRISH,
    SCOTTISH,
    WELSH,
    NORTHERN_IRISH,
    LUXEMBOURGER,
    AUSTRIAN,
    CROATIAN,
    SERBIAN,
    BOSNIAN,
    SLOVENIAN,
    MACEDONIAN,
    MONTENEGRIN,
    KOSOVAR,
    ALBAN
}

public class Person {
    private String name;
    private int age;
    private String gender;
    private float height;
    private float weight;
    Nationality nationality;

    public Person(String name, int age, String gender, float height, float weight, Nationality nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public static void main(String[] args) {
        Person person = new Person("John", 26, "Male", 1.80f, 80.0f, Nationality.FRENCH);
        person.getAttributes();
    }

    public  void getAttributes() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Nationality: " + nationality);
    }
}
