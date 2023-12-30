import java.nio.IntBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.glfw.Callbacks;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWVidMode;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Main {
	private long window;

	public static void main(String[] args){
		
	}
	public void run(){

	}
	public void init(){
		GLFWErrorCallback.createPrint(System.err).set();
		if(!GLFW.glfwInit()){
			throw new IllegalStateException("Unable to initialize GLFW");

		}
			GLFW.glfwDefaultWindowHints();
			GLFW.glfwWindowHint(GLFW.GLFW_VISIBLE, GLFW.GLFW_FALSE);
			GLFW.glfwWindowHint(GLFW.GLFW_RESIZABLE, GLFW.GLFW_TRUE);
		window = GLFW.glfwCreateWindow(640, 480, "LWJGL Bootcamp", NULL, NULL);
		if(window==	NULL)
			throw new IllegalStateException("Unable to create window");
		GLFW.glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {}); // What does this do?

		try(MemoryStack stack = stackPush()){
			IntBuffer pWidth = stack.mallocInt(1);
			IntBuffer pHeight = stack.mallocInt(1);

		}
	}
	public void loop(){

d
	}
}
