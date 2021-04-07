import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DataKafkaComponent } from './data-kafka.component';

describe('DataKafkaComponent', () => {
  let component: DataKafkaComponent;
  let fixture: ComponentFixture<DataKafkaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DataKafkaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DataKafkaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
