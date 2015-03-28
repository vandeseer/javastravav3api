package javastrava.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Dan Shannon
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class AbstractSubActivity extends AbstractActivity {
	private Activity activity;
}
