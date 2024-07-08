public class TestFileClass {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("image/us.gif");
        System.out.println("Does it exist?"+file.exists());
        System.out.println("The file has "+file.length()+" bytes");
        System.out.println("Can it Read "+file.canRead());
        System.out.println("Can it be written? "+file.canWrite());
        System.out.println("is it a directory ? "+file.isDirectory());
        System.out.println("Is it a file ? "+file.isFile());
        System.out.println("is it absolute ? "+file.isAbsolute());
        System.out.println("Is it Hidden? "+file.isHidden());
        System.out.println("Absolute path is "+file.getAbsolutePath());
        System.out.println("Last modified on "+new java.util.Date(file.lastModified()));
    }
}
