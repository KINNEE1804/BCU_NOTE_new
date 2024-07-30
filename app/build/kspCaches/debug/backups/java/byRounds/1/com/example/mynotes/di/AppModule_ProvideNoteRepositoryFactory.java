package com.example.mynotes.di;

import com.example.mynotes.data.database.NotesDatabase;
import com.example.mynotes.data.repository.NoteRepositoryImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
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
public final class AppModule_ProvideNoteRepositoryFactory implements Factory<NoteRepositoryImpl> {
  private final Provider<NotesDatabase> dbProvider;

  public AppModule_ProvideNoteRepositoryFactory(Provider<NotesDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public NoteRepositoryImpl get() {
    return provideNoteRepository(dbProvider.get());
  }

  public static AppModule_ProvideNoteRepositoryFactory create(Provider<NotesDatabase> dbProvider) {
    return new AppModule_ProvideNoteRepositoryFactory(dbProvider);
  }

  public static NoteRepositoryImpl provideNoteRepository(NotesDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNoteRepository(db));
  }
}
