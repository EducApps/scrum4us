import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { TimeComponent } from './time/time.component';
import { StoryComponent } from './story/story.component';
import { BacklogComponent } from './backlog/backlog.component';
import { SprintComponent } from './sprint/sprint.component';


@NgModule({
  declarations: [
    AppComponent,
    TimeComponent,
    StoryComponent,
    BacklogComponent,
    SprintComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
