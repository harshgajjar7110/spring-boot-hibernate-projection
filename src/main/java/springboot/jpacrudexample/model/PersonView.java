package springboot.jpacrudexample.model;

public interface PersonView {
    String getFirstName();
    //  @Value("#{target.firstName + ' ' + target.lastName}")
    // String getFullName();
}
