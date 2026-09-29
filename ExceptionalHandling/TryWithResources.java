public class TryWithResources {

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("file.txt")) {
           System.out.println("File opened successfully");
            // Perform file operations
        } catch (FileNotFoundException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}
