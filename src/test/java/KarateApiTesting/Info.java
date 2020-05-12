package KarateApiTesting;

public class Info
{
    private int id;
    private String name;
    private String last;
    private int age;
    private char gender;

    // Calling getters and setters
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getLast()
    {
        return last;
    }
    public void setLast(String last)
    {
        this.last = last;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    public char getGender()
    {
        return gender;
    }

    public void setGender(char gender)
    {
        this.gender = gender;
    }


    // Creating toString
    @Override
    public String toString()
    {
        return "Info [Id="
                + this.id
                + ", name="
                + this.name
                + ", last="
                + this.last
                + ", age="
                + this.age
                + ", gender"
                + this.gender + "]";
    }
}
