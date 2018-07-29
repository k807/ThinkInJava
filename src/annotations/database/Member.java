package annotations.database;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-25 19:58
 * =============================================
 */
@DBTable(name = "MEMBER")
public class Member {
    @SQLString(30)
    String firstname;
    @SQLString(50)
    String lastname;
    @SQLInteger
    Integer age;
    @SQLString(value = 30, constraints = @Constraints(primaryKey = true))
    String handle;

    static int memberCount;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Integer getAge() {
        return age;
    }

    public String getHandle() {
        return handle;
    }

    public static int getMemberCount() {
        return memberCount;
    }

    @Override
    public String toString() {
        return "Member{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", handle='" + handle + '\'' +
                '}';
    }
}
