import java.util.HashSet;
import java.util.Set;

public class Employee {

	private String name;
	private Set<String> device;
	
	/*public Employee(String name,Set<String> devc) {
		this.name=name;
		this.device=devc;
	}*/
	public void addevice(String devc) {
		if(this.device==null) {
			this.device=new HashSet<String>();
		}
		this.device.add(devc);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public Set<String> getdevice() {
		return device;
	}
	public void setDevice(Set<String> device) {
		this.device=device;
	}
}
