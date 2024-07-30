package com.example.mynotes;

import android.content.Context;
import com.example.mynotes.domain.repository.NoteRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class NoteViewModel_Factory implements Factory<NoteViewModel> {
  private final Provider<NoteRepository> repositoryProvider;

  private final Provider<Context> contextProvider;

  public NoteViewModel_Factory(Provider<NoteRepository> repositoryProvider,
      Provider<Context> contextProvider) {
    this.repositoryProvider = repositoryProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public NoteViewModel get() {
    return newInstance(repositoryProvider.get(), contextProvider.get());
  }

  public static NoteViewModel_Factory create(Provider<NoteRepository> repositoryProvider,
      Provider<Context> contextProvider) {
    return new NoteViewModel_Factory(repositoryProvider, contextProvider);
  }

  public static NoteViewModel newInstance(NoteRepository repository, Context context) {
    return new NoteViewModel(repository, context);
  }
}
