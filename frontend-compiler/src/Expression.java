package org.whdl.frontend;

abstract class Expression {
  private SourceLocation sourceLocation;

  public Expression(SourceLocation sourceLocation) {
    this.sourceLocation = sourceLocation;
  }

  public SourceLocation getSourceLocation() {
    return sourceLocation;
  }

  public abstract VariableIdentifier getOutputTypeIdentifier();
  public abstract TypeValue getOutputType();
  public abstract ClockValue getOutputClock();

  // Preform semantic verification on this expression
  // public abstract void verify();
  
  // Compile this expression into intermediate code
  // public abstract whdl.backend.Program compile();

  // True if there is a finite set of possible output values, false if value
  // comes from a top level io port
  public abstract Boolean isCompiletimeKnowableValues();
  // Returns finite set of possible output values (if knowable)
  public abstract Set<Value> getCompiletimeKnowableValues();
  // True if the expression always outputs the same value, knowable at compiletime.
  public abstract Boolean isSingleCompiletimeKnowableValue();
  // The compiletime-knowable value
  public abstract Value getSingleCompiletimeKnowableValue();

  // Collapse compiletime knowable values into a literal.
  public abstract Expression collapseCompliletimeKnowable();
}