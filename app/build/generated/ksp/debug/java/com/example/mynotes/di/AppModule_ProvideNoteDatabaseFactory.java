package com.example.mynotes.di;

import android.content.Context;
import com.example.mynotes.data.database.NotesDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class AppModule_ProvideNoteDatabaseFactory implements Factory<NotesDatabase> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideNoteDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public NotesDatabase get() {
    return provideNoteDatabase(contextProvider.get());
  }

  public static AppModule_ProvideNoteDatabaseFactory create(Provider<Context> contextProvider) {
    return new AppModule_ProvideNoteDatabaseFactory(contextProvider);
  }

  public static NotesDatabase provideNoteDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNoteDatabase(context));
  }
}
