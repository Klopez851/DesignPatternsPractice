package kl.practice.Structural.Composite;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class File implements FileSystem{
    private int size;
    private String content;

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void print() {
        System.out.println(content);
    }

    @Override
    public void delete() {
        System.out.println("deleting file "+content);
    }

    @Override
    public int fileCount() {
        return 1;
    }

}
