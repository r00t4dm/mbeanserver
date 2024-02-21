public class Hello implements HelloMBean{

    private String name = "aaa";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String newName) {
        this.name = newName;
    }

    @Override
    public String sayHello() {
        return "hello: " + name;
    }
}
