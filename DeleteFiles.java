import java.io.File;
import java.util.Stack;
class DeleteFiles {
	public static void main(String[] args) {
		/**Traverse the given Path,if it's file,delete it.
		if it's a derectory, push into the stack
		the latest derectory will be the new Path be traversed
		*/
		File path=new File("Path");  //the given path;
		Stack<File> files=new Stack<File>();
		files.push(path);
		while(true) {
			File[] f=path.listFiles();
			//if the path without any thing.delete it, stack.pop();
			if ( f.length == 0) {
				path.delete();
				files.pop();
			}
			//operate for the path,if it not empty;
			else {
				for(int i=0;i<f.length;i++) {
					//delete file
					if( f[i].isFile() ) {
						f[i].delete();
					}
					//if a derectory,push into stack;
					else {
						files.push(f[i]);
					}
				}
			}
			//quit 
			if( files.empty() ) {
				break;
			}
			//
			path=files.peek();
		}
		System.out.println("complete");
	}
}
