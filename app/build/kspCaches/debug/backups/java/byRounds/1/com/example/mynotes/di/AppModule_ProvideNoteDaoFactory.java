package com.example.mynotes.di;

import com.example.mynotes.data.dao.NoteDao;
import com.example.mynotes.data.database.NotesDatabase;
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
public final class AppModule_ProvideNoteDaoFactory implements Factory<NoteDao> {
  private final Provider<NotesDatabase> databaseProvider;

  public AppModule_ProvideNoteDaoFactory(Provider<NotesDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public NoteDao get() {
    return provideNoteDao(databaseProvider.get());
  }

  public static AppModule_ProvideNoteDaoFactory create(Provider<NotesDatabase> databaseProvider) {
    return new AppModule_ProvideNoteDaoFactory(databaseProvider);
  }

  public static NoteDao provideNoteDao(NotesDatabase database) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNoteDao(database));
  }
}
