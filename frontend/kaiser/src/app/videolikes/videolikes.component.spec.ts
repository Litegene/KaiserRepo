import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VideolikesComponent } from './videolikes.component';

describe('VideolikesComponent', () => {
  let component: VideolikesComponent;
  let fixture: ComponentFixture<VideolikesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VideolikesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(VideolikesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
