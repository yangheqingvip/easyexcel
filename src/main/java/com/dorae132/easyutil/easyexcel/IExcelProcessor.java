package com.dorae132.easyutil.easyexcel;

/**
 * process the file that has been created
 * @author Dorae
 *
 * @param <T>
 */
@FunctionalInterface
public interface IExcelProcessor <T, F> {
	public T process(F f);
}
