package amazon;
/*
Write a function that provides change directory (cd) function for an abstract file system.
Notes:
Root path is '/'.
Path separator is '/'.
Parent directory is addressable as "..".
Directory names consist only of English alphabet letters (A-Z and a-z).
The function should support both relative and absolute paths.
The function will not be passed any invalid paths.
Do not use built-in path-related functions.
For example:
Path path = new Path("/a/b/c/d");
path.cd('../x');
System.out.println(path.getPath());
should display '/a/b/c/x'.
 */

class Path{
	public String path;
	
	public Path(String path) {
		this.path=path;
	}
	
	public String getPath() {
		return path;
	}
	
	public void cd(String newPath) {
		if(this.path=="/") {
			return;
		}
		
		for(String folder : newPath.split("/")) {
			if(folder.equals("..")) {
				this.path = this.path.substring(0,this.path.lastIndexOf("/"));
			}else {
				this.path = this.path + "/" + folder;
			}
		}
	}
}
public class PathChangeDirectory {
	public static void main(String[] args) {
		Path path = new Path("/a/b/c/d");
        path.cd("../x");
        System.out.println(path.getPath());
	}
}
