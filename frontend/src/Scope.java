package org.whdl.frontend;

abstract class Scope {
  public abstract Variable getVariable(VariableIdentifier identifier);

  public Value getVariableValue(VariableIdentifier identifier) {
    getVariable(identifier).getValue();
  }

  Scope getParentScope() {
    return parentScope;
  }
}