package factoryMethod;

public class FactoryMethodApp {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality){
        if(speciality.equalsIgnoreCase("java")){

            return new JavaDeveloperFactory();
        } else if(speciality.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + "is unknown speciality");
        }
    }
}
