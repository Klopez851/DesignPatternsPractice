package kl.practice.Structural.Composite;

/*
 * ============================================================
 * 3. COMPOSITE — File System
 * ============================================================
 *
 * INITIAL EXERCISE
 *
 * Create:
 *
 *     File
 *     Directory
 *
 * Both should support:
 *
 *     getSize()
 *     print()
 *
 * A Directory can contain Files and other Directories.
 *
 * Example:
 *
 *     root/
 *     ├── a.txt       10 KB
 *     ├── b.txt       20 KB
 *     └── photos/
 *         ├── a.jpg   500 KB
 *         └── b.jpg   700 KB
 *
 * root.getSize() should return 1230 KB.
 *
 * root.print() should recursively print the hierarchy.
 *
 * Client code should be able to treat a File and Directory
 * uniformly.
 *
 *
 * FOLLOW-UP
 *
 * Add a new operation:
 *
 *     delete()
 *
 * A File should delete itself.
 *
 * A Directory should recursively delete all of its children
 * before deleting itself.
 *
 * Then add:
 *
 *     getFileCount()
 *
 * which returns the total number of files contained within a
 * directory, including files inside nested directories.
 *
 * QUESTION TO CONSIDER:
 *
 * Did you have to modify client code when you added these
 * operations?
 *
 * Why is that one of the benefits of Composite?
 *
 * ============================================================
 */

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<FileSystem> photoList = new ArrayList<>();
        photoList.add(new File(500, "a.txt"));
        photoList.add(new File(700, "b.txt"));
        FileSystem photos = new Directory(photoList);

        List<FileSystem> files = new ArrayList<>();
        files.add(new File(10, "a.jpg"));
        files.add(new File(20, "b.jpg"));
        files.add(photos);
        FileSystem root = new Directory(files);

        System.out.println(root.getSize());
        root.print();

    }
}
