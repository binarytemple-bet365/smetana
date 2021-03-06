/* ========================================================================
 * PlantUML : a free UML diagram generator
 * ========================================================================
 *
 * Project Info:  http://plantuml.com
 * 
 * This file is part of Smetana.
 * Smetana is a partial translation of Graphviz/Dot sources from C to Java.
 *
 * (C) Copyright 2009-2017, Arnaud Roques
 *
 * This translation is distributed under the same Licence as the original C program.
 * 
 * THE ACCOMPANYING PROGRAM IS PROVIDED UNDER THE TERMS OF THIS ECLIPSE PUBLIC
 * LICENSE ("AGREEMENT"). [Eclipse Public License - v 1.0]
 * 
 * ANY USE, REPRODUCTION OR DISTRIBUTION OF THE PROGRAM CONSTITUTES
 * RECIPIENT'S ACCEPTANCE OF THIS AGREEMENT.
 * 
 * You may obtain a copy of the License at
 * 
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package dot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainDot {

	public static void main(String[] args) throws IOException {
		if (args.length != 2) {
			System.out.println("Usage : java -jar jdot.jar INPUT_FILE.dot OUTPUT_FILE.png");
			System.out.println("See http://plantuml.com/smetana01.html for more information");
			return;
		}
		final BufferedReader br = new BufferedReader(new FileReader(args[0]));
		String s;
		Digraph digraph = new Digraph();
		while ((s = br.readLine()) != null) {
			digraph.addString(s);
		}
		br.close();
		digraph.layout();
		final Graphic graphic = digraph.getGraphic();
		final File png = new File(args[1]);
		graphic.drawTo(png);

	}

}
