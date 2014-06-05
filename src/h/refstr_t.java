package h;
import core.*;
import core.annotation.*;

// 61ughvl20d1mf5vtkmd94wfy

@TranslatedBy("plantuml") 
public class refstr_t extends Structure {
    final public Dtlink_t link = new Dtlink_t(this);
    public @Unsigned long refcnt;
    public StarChar s;
    final public StarChar store = new StarCharAutoAllocDynamic();	/* this is actually a dynamic array */

	public StarVoid castTo(Class clazz) {
		if (clazz==Dtlink_t.class) {
			return link;
		}
		return super.castTo(clazz);
	}
        
	public StarVoid addByte(OFFSET offset) {
		if (offset==null) return this;
		return ASREF(offset.name);
	}
	
	public StarVoid ASREF(String name) {
		if (name.equals("s")) {
			return new StarStarCharAdapter() {
				public StarChar get() {
					return s;
				}
				public StarChar set(StarChar data) {
					s = data;
					return s;
				}
			};
		}
		return super.ASREF(name);
	}
	
	public void reset() {
	    link.reset();
	    refcnt = 0;
	    s = null;
	    ((StarCharAutoAllocDynamic)store).reset();
	}
}

// typedef struct refstr_t {
//     Dtlink_t link;
//     unsigned long refcnt;
//     char *s;
//     char store[1];		/* this is actually a dynamic array */
// } refstr_t;