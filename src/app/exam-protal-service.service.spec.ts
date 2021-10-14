import { TestBed } from '@angular/core/testing';

import { ExamProtalServiceService } from './exam-protal-service.service';

describe('ExamProtalServiceService', () => {
  let service: ExamProtalServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ExamProtalServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
