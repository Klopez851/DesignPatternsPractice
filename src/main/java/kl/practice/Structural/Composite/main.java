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

public class main {
}
