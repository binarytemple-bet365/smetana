package h;
import core.*;
import core.annotation.*;

// 9xilv9or3ptvy3gupp6t2ql19

@TranslatedBy("plantuml")
public class gvcolor_t {
	public color_type_t type;
	public void reset() {
		type = null;
	}
}


// typedef struct color_s {
//     union {
// 	double RGBA[4];
// 	double HSVA[4];
// 	unsigned char rgba[4];
// 	unsigned char cmyk[4];
// 	int rrggbbaa[4];
// 	char *string;
// 	int index;
//     } u;
//     color_type_t type;
// } gvcolor_t;