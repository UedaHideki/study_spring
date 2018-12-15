#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import org.springframework.context.annotation.Configuration;

public class ServiceEx1 {
	public int getIncrementValue(int x) {
		return x+1;
	}
}
