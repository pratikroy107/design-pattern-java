
public abstract class View {
	// the abstraction
	IResource res;
	View(IResource res)
	{
		this.res = res;
	}
	abstract void show();
}
