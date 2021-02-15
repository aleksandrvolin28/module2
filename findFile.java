import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class findFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File f;
        String nameFile, file;
        boolean result = false;
        System.out.println("Введите путь к файлу: ");
        nameFile = input.nextLine();
        if (nameFile.isEmpty()) {
            Path currentRelativePath = Paths.get("");
            String s = currentRelativePath.toAbsolutePath().toString();
            System.out.println("Текущий каталог: " + s + " В нем будет выполнен поиск вашего файла.");
            nameFile = s;
        }
        f = new File(nameFile + ".");
        System.out.println("Введите имя файла: ");
        file = input.nextLine();
        File[] files = f.listFiles();
        for (int i = 0; i < files.length; i++)
            if (files[i].toString().equals(nameFile + ".\\" + file) && files[i].isFile()) {
                result = true;
                break;
            }
            if (result == true) {
                System.out.println("Вы можете получить доступ к своему файлу по ссылке ниже:");
                System.out.println(nameFile + "\\" + file);
                } else {
                System.out.println("Файл не найден!!! ");
            }
    }
}

//D:\Java Learning\ModuleTwo