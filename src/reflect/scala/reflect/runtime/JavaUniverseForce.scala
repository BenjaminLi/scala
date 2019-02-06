/*
 * Scala (https://www.scala-lang.org)
 *
 * Copyright EPFL and Lightbend, Inc.
 *
 * Licensed under Apache License 2.0
 * (http://www.apache.org/licenses/LICENSE-2.0).
 *
 * See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 */

// Generated Code, validated by run/t6240-universe-code-gen.scala
package scala.reflect
package runtime

trait JavaUniverseForce { self: runtime.JavaUniverse  =>
  def force(): Unit = {
    Literal(Constant(42)).duplicate
    nme.flattenedName(NoSymbol, nme.NO_NAME)
    nme.raw
    WeakTypeTag
    TypeTag
    TypeTag.Byte.tpe
    TypeTag.Short.tpe
    TypeTag.Char.tpe
    TypeTag.Int.tpe
    TypeTag.Long.tpe
    TypeTag.Float.tpe
    TypeTag.Double.tpe
    TypeTag.Boolean.tpe
    TypeTag.Unit.tpe
    TypeTag.Any.tpe
    TypeTag.AnyVal.tpe
    TypeTag.AnyRef.tpe
    TypeTag.Object.tpe
    TypeTag.Nothing.tpe
    TypeTag.Null.tpe

    this.settings
    this.internal
    this.treeInfo
    this.rootMirror
    this.traceSymbols
    this.perRunCaches
    this.compat
    this.treeBuild
    this.FreshNameExtractor
    this.FixedMirrorTreeCreator
    this.FixedMirrorTypeCreator
    this.CompoundTypeTreeOriginalAttachment
    this.SAMFunction
    this.DelambdafyTarget
    this.BackquotedIdentifierAttachment
    this.NoWarnAttachment
    this.PatVarDefAttachment
    this.ForAttachment
    this.SyntheticUnitAttachment
    this.SubpatternsAttachment
    this.NoInlineCallsiteAttachment
    this.InlineCallsiteAttachment
    this.OuterArgCanBeElided
    this.UseInvokeSpecial
    this.TypeParamVarargsAttachment
    this.KnownDirectSubclassesCalled
    this.ConstructorNeedsFence
    this.noPrint
    this.typeDebug
    // inaccessible: this.posAssigner
    this.ConsoleWriter
    this.RefTree
    this.PackageDef
    this.ClassDef
    this.ModuleDef
    this.ValOrDefDef
    this.ValDef
    this.DefDef
    this.TypeDef
    this.LabelDef
    this.ImportSelector
    this.Import
    this.Template
    this.Block
    this.CaseDef
    this.Alternative
    this.Star
    this.Bind
    this.UnApply
    this.ArrayValue
    this.Function
    this.Assign
    this.NamedArg
    this.If
    this.Match
    this.Return
    this.Try
    this.Throw
    this.New
    this.Typed
    this.MethodValue
    this.TypeApply
    this.Apply
    this.ApplyDynamic
    this.Super
    this.This
    this.Select
    this.Ident
    this.ReferenceToBoxed
    this.Literal
    this.Annotated
    this.SingletonTypeTree
    this.SelectFromTypeTree
    this.CompoundTypeTree
    this.AppliedTypeTree
    this.TypeBoundsTree
    this.ExistentialTypeTree
    this.TypeTree
    this.Modifiers
    this.EmptyTree
    this.noSelfType
    this.pendingSuperCall
    this.emptyValDef
    this.EmptyTreeTypeSubstituter
    this.UnmappableAnnotArg
    this.LiteralAnnotArg
    this.ArrayAnnotArg
    this.NestedAnnotArg
    this.AnnotationInfo
    this.Annotation
    this.UnmappableAnnotation
    this.ThrownException
    this.typeNames
    this.tpnme
    this.fulltpnme
    this.binarynme
    this.termNames
    this.nme
    this.sn
    this.undetBaseTypeSeq
    this.Constant
    this.definitions
    this.LookupSucceeded
    this.LookupAmbiguous
    this.LookupInaccessible
    this.LookupNotFound
    this.Scope
    this.EmptyScope
    this.Flag
    this.KindErrors
    this.Kind
    this.ProperTypeKind
    this.TypeConKind
    this.inferKind
    this.UnmappableTree
    this.ErrorType
    this.WildcardType
    this.BoundedWildcardType
    this.OverloadedArgFunProto
    this.NoType
    this.NoPrefix
    this.ThisType
    this.SingleType
    this.SuperType
    this.TypeBounds
    this.CompoundType
    this.baseClassesCycleMonitor
    this.RefinedType
    this.ClassInfoType
    this.ConstantType
    this.FoldableConstantType
    this.LiteralType
    this.TypeRef
    this.MethodType
    this.NullaryMethodType
    this.PolyType
    this.ExistentialType
    this.OverloadedType
    this.ImportType
    this.AntiPolyType
    this.HasTypeMember
    this.ArrayTypeRef
    this.TypeVar
    this.AnnotatedType
    this.StaticallyAnnotatedType
    this.NamedType
    this.RepeatedType
    this.ErasedValueType
    this.GenPolyType
    this.unwrapToClass
    this.unwrapToStableClass
    this.unwrapWrapperTypes
    this.RecoverableCyclicReference
    this.TypeConstraint
    this.normalizeAliases
    this.dropSingletonType
    this.abstractTypesToBounds
    this.dropIllegalStarTypes
    this.wildcardExtrapolation
    this.IsDependentCollector
    this.ApproximateDependentMap
    this.wildcardToTypeVarMap
    this.typeVarToOriginMap
    this.ErroneousCollector
    this.adaptToNewRunMap
    this.SubTypePair
    this.SymbolKind
    this.NoSymbol
    this.CyclicReference
    this.SymbolOps
    this.TermName
    this.TypeName
    this.Liftable
    this.Unliftable
    this.BooleanFlag
    this.WeakTypeTag
    this.TypeTag
    this.Expr
    this.NoMods
    definitions.JavaLangPackage
    definitions.JavaLangPackageClass
    definitions.ScalaPackage
    definitions.ScalaPackageClass
    definitions.RuntimePackage
    definitions.RuntimePackageClass
    definitions.AnyClass
    definitions.AnyRefClass
    definitions.ObjectClass
    definitions.AnyRefTpe
    definitions.AnyTpe
    definitions.AnyValTpe
    definitions.BoxedUnitTpe
    definitions.NothingTpe
    definitions.NullTpe
    definitions.ObjectTpe
    definitions.SerializableTpe
    definitions.StringTpe
    definitions.ThrowableTpe
    definitions.ConstantTrue
    definitions.ConstantFalse
    definitions.ConstantNull
    definitions.AnyValClass
    definitions.RuntimeNothingClass
    definitions.RuntimeNullClass
    definitions.NothingClass
    definitions.NullClass
    definitions.ClassCastExceptionClass
    definitions.IndexOutOfBoundsExceptionClass
    definitions.InvocationTargetExceptionClass
    definitions.MatchErrorClass
    definitions.NonLocalReturnControlClass
    definitions.NullPointerExceptionClass
    definitions.ThrowableClass
    definitions.UninitializedErrorClass
    definitions.RuntimeExceptionClass
    definitions.IllegalArgExceptionClass
    definitions.UninitializedFieldConstructor
    definitions.PartialFunctionClass
    definitions.AbstractPartialFunctionClass
    definitions.SymbolClass
    definitions.StringClass
    definitions.StringModule
    definitions.ClassClass
    definitions.DynamicClass
    definitions.UnqualifiedModules
    definitions.UnqualifiedOwners
    definitions.PredefModule
    definitions.SpecializableModule
    definitions.ScalaRunTimeModule
    definitions.SymbolModule
    definitions.ScalaNumberClass
    definitions.DelayedInitClass
    definitions.TypeConstraintClass
    definitions.SingletonClass
    definitions.SerializableClass
    definitions.ComparableClass
    definitions.JavaCloneableClass
    definitions.JavaNumberClass
    definitions.JavaEnumClass
    definitions.JavaUtilMap
    definitions.JavaUtilHashMap
    definitions.ByNameParamClass
    definitions.JavaRepeatedParamClass
    definitions.RepeatedParamClass
    definitions.SubTypeClass
    definitions.SameTypeClass
    definitions.DummyImplicitClass
    definitions.ConsClass
    definitions.IteratorClass
    definitions.IterableClass
    definitions.ListClass
    definitions.SeqClass
    definitions.JavaStringBuilderClass
    definitions.JavaStringBufferClass
    definitions.JavaCharSequenceClass
    definitions.TraversableClass
    definitions.ListModule
    definitions.NilModule
    definitions.SeqModule
    definitions.ArrayModule
    definitions.ArrayModule_overloadedApply
    definitions.ArrayClass
    definitions.Array_apply
    definitions.Array_update
    definitions.Array_length
    definitions.Array_clone
    definitions.SoftReferenceClass
    definitions.MethodClass
    definitions.EmptyMethodCacheClass
    definitions.MethodCacheClass
    definitions.StructuralCallSite
    definitions.StructuralCallSite_dummy
    definitions.SymbolLiteral
    definitions.ScalaXmlTopScope
    definitions.ScalaXmlPackage
    definitions.ReflectPackage
    definitions.ReflectApiPackage
    definitions.ReflectRuntimePackage
    definitions.UniverseClass
    definitions.PartialManifestModule
    definitions.FullManifestClass
    definitions.FullManifestModule
    definitions.OptManifestClass
    definitions.NoManifest
    definitions.TreesClass
    definitions.ExprsClass
    definitions.ClassTagModule
    definitions.ClassTagClass
    definitions.TypeTagsClass
    definitions.ApiUniverseClass
    definitions.JavaUniverseClass
    definitions.MirrorClass
    definitions.TypeCreatorClass
    definitions.TreeCreatorClass
    definitions.BlackboxContextClass
    definitions.WhiteboxContextClass
    definitions.MacroImplAnnotation
    definitions.StringContextClass
    definitions.StringContextModule
    definitions.ValueOfClass
    definitions.QuasiquoteClass
    definitions.QuasiquoteClass_api
    definitions.QuasiquoteClass_api_apply
    definitions.QuasiquoteClass_api_unapply
    definitions.ScalaSignatureAnnotation
    definitions.ScalaLongSignatureAnnotation
    definitions.MethodHandleClass
    definitions.VarHandleClass
    definitions.OptionClass
    definitions.OptionModule
    definitions.SomeClass
    definitions.NoneModule
    definitions.SomeModule
    definitions.ModuleSerializationProxyClass
    definitions.VarArityClass
    definitions.ProductClass
    definitions.TupleClass
    definitions.FunctionClass
    definitions.AbstractFunctionClass
    definitions.MacroContextType
    definitions.ProductRootClass
    definitions.Any_$eq$eq
    definitions.Any_$bang$eq
    definitions.Any_equals
    definitions.Any_hashCode
    definitions.Any_toString
    definitions.Any_$hash$hash
    definitions.Any_getClass
    definitions.Any_isInstanceOf
    definitions.Any_asInstanceOf
    definitions.primitiveGetClassMethods
    definitions.getClassMethods
    definitions.Object_$hash$hash
    definitions.Object_$eq$eq
    definitions.Object_$bang$eq
    definitions.Object_eq
    definitions.Object_ne
    definitions.Object_isInstanceOf
    definitions.Object_asInstanceOf
    definitions.Object_synchronized
    definitions.String_$plus
    definitions.ObjectRefClass
    definitions.VolatileObjectRefClass
    definitions.RuntimeStaticsModule
    definitions.BoxesRunTimeModule
    definitions.BoxesRunTimeClass
    definitions.BoxedNumberClass
    definitions.BoxedCharacterClass
    definitions.BoxedBooleanClass
    definitions.BoxedByteClass
    definitions.BoxedShortClass
    definitions.BoxedIntClass
    definitions.BoxedLongClass
    definitions.BoxedFloatClass
    definitions.BoxedDoubleClass
    definitions.BoxedUnitClass
    definitions.BoxedUnitModule
    definitions.AnnotationClass
    definitions.ConstantAnnotationClass
    definitions.StaticAnnotationClass
    definitions.AnnotationRetentionAttr
    definitions.AnnotationRetentionPolicyAttr
    definitions.AnnotationRepeatableAttr
    definitions.ElidableMethodClass
    definitions.ImplicitNotFoundClass
    definitions.ImplicitAmbiguousClass
    definitions.MigrationAnnotationClass
    definitions.ScalaStrictFPAttr
    definitions.SwitchClass
    definitions.TailrecClass
    definitions.VarargsClass
    definitions.uncheckedStableClass
    definitions.uncheckedVarianceClass
    definitions.BeanPropertyAttr
    definitions.BooleanBeanPropertyAttr
    definitions.CompileTimeOnlyAttr
    definitions.DeprecatedAttr
    definitions.DeprecatedNameAttr
    definitions.DeprecatedInheritanceAttr
    definitions.DeprecatedOverridingAttr
    definitions.NativeAttr
    definitions.ScalaInlineClass
    definitions.ScalaNoInlineClass
    definitions.SerialVersionUIDAttr
    definitions.SerialVersionUIDAnnotation
    definitions.SpecializedClass
    definitions.ThrowsClass
    definitions.TransientAttr
    definitions.UncheckedClass
    definitions.UncheckedBoundsClass
    definitions.UnspecializedClass
    definitions.UnusedClass
    definitions.VolatileAttr
    definitions.FunctionalInterfaceClass
    definitions.BeanGetterTargetClass
    definitions.BeanSetterTargetClass
    definitions.FieldTargetClass
    definitions.GetterTargetClass
    definitions.ParamTargetClass
    definitions.SetterTargetClass
    definitions.ObjectTargetClass
    definitions.ClassTargetClass
    definitions.MethodTargetClass
    definitions.LanguageFeatureAnnot
    definitions.InheritedAttr
    definitions.JUnitAnnotations
    definitions.languageFeatureModule
    definitions.metaAnnotations
    definitions.AnnotationDefaultAttr
    definitions.isPhantomClass
    definitions.syntheticCoreClasses
    definitions.syntheticCoreMethods
    definitions.hijackedCoreClasses
    definitions.symbolsNotPresentInBytecode
    definitions.isPossibleSyntheticParent
    definitions.ShowAsInfixAnnotationClass
    definitions.abbrvTag
    definitions.numericWeight
    definitions.boxedModule
    definitions.boxedClass
    definitions.refClass
    definitions.volatileRefClass
    definitions.lazyHolders
    definitions.LazyRefClass
    definitions.LazyUnitClass
    definitions.allRefClasses
    definitions.UnitClass
    definitions.ByteClass
    definitions.ShortClass
    definitions.CharClass
    definitions.IntClass
    definitions.LongClass
    definitions.FloatClass
    definitions.DoubleClass
    definitions.BooleanClass
    definitions.UnitTpe
    definitions.ByteTpe
    definitions.ShortTpe
    definitions.CharTpe
    definitions.IntTpe
    definitions.LongTpe
    definitions.FloatTpe
    definitions.DoubleTpe
    definitions.BooleanTpe
    definitions.ScalaNumericValueClasses
    definitions.ScalaValueClassesNoUnit
    definitions.ScalaValueClasses
    definitions.ScalaValueClassesSet
    definitions.ScalaNumericValueClassesSet

    uncurry.VarargsSymbolAttachment
    uncurry.DesugaredParameterType
    erasure.GenericArray
    erasure.scalaErasure
    erasure.specialScalaErasure
    erasure.javaErasure
    erasure.verifiedJavaErasure
    erasure.boxingErasure
  }
}
