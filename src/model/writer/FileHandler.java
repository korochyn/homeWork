package model.writer;

import model.human.Human;
import model.tree.Tree;

import java.io.*;



public class FileHandler implements Writable {

    public String filePath = "src/family_tree/family_tree.txt";

    public boolean save(Serializable serializable, String filePath) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(serializable);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Tree<Human> read(String filePath) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))){
            return (Tree<Human>) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean save(Serializable serializable) {
        return save(serializable, this.filePath);
    }

    public Tree<Human> read() {
        return read(this.filePath);

    }

}
