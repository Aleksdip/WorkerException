public class Worker {
     String name;
     String post;
     String data;

    public String getName() {
        return name;
    }

    public Worker(String name, String post, String data) {
        this.name = name;
        this.post = post;
        try {
            if (data.length() != 4)
                throw new Exception("Invalid date format\n");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.data = data;

    }
    @Override
     public String toString () {
        return "Name = " + name + ", post = " + post + ", Data = " + data;
     }
}
