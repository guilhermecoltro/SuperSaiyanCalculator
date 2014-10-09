import java.util.ArrayList;

public class Element{

	public ArrayList<Element> in;
	public ArrayList<Element> out;
	public String name;
	
	public Element(String name, ArrayList<Element> in, ArrayList<Element> out){
		this.name = name;
		this.in = in;
		this.out = out;
	}

	public void setIn(ArrayList<Element> in){
		this.in = in;
	}

	public ArrayList<Element> getIn(){
		return this.in;
	}

	public void setOut(ArrayList<Element> out){
		this.out = out;
	}

	public ArrayList getOut(){
		return this.out;
	}

	public void setName(){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public boolean inIn(Element e){
		return this.in.contains(e);
	}

	public boolean isOut(Element e){
		return this.out.contains(e);
	}
}