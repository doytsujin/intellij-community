package com.intellij.structuralsearch.impl.matcher.filters;

import com.intellij.psi.PsiAnonymousClass;
import com.intellij.psi.PsiClass;

/**
 * Created by IntelliJ IDEA.
 * User: maxim
 * Date: 26.12.2003
 * Time: 19:37:13
 * To change this template use Options | File Templates.
 */
public class ClassFilter extends NodeFilter {
  @Override public void visitAnonymousClass(PsiAnonymousClass psiAnonymousClass) {
    result = true;
  }

  @Override public void visitClass(PsiClass psiClass) {
    result = true;
  }

  private static NodeFilter instance;

  public static NodeFilter getInstance() {
    if (instance==null) instance = new ClassFilter();
    return instance;
  }

  private ClassFilter() {
  }
}
